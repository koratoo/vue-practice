<template>
    <div>
        <hr/>
        <form>
            <div class="search-box">
                <FromToBox />
                <SelectBox :codeType="'M005'" label="skillLevel"/>
                <SelectBox :codeType="'M006'" label="gender"/>
                <InputBox />
                <button type="button"  @click="searchMember" >검색</button>
            </div>
        </form>
        <hr/>
        <MemberTable :searchResults="searchResults" />

    </div>
</template>


<script>
    import { ref } from 'vue';
    import axios from 'axios';
    import SelectBox from "@/components/searchbox/SelectBox";
    import FromToBox from "@/components/searchbox/FromToBox";
    import InputBox from "@/components/searchbox/InputBox";
    import MemberTable from "@/components/table/MemberTable";

    export default {
        name: "MemberMain",
        components: { MemberTable, InputBox, FromToBox, SelectBox},
        setup() {
            const searchResults = ref([]);
            const memberSearch = ref({
                name: '',
                gender: '',
                skillLevel: '',
                from: '',
                to: '',
            });

            async function searchMember() {
                console.log("클릭");
                memberSearch.value.gender = document.getElementsByName("gender")[0].value;
                memberSearch.value.skillLevel = document.getElementsByName("skillLevel")[0].value;
                memberSearch.value.from = document.getElementsByName("from")[0].value;
                memberSearch.value.to = document.getElementsByName("to")[0].value;
                memberSearch.value.name = document.getElementsByName("name")[0].value;

                try {
                    const response = await axios.get('/member/search', {
                        params: memberSearch.value,
                    });
                    searchResults.value = response.data;
                } catch (error) {
                    console.error('Error:', error);
                }
            }

            return {
                searchResults,
                searchMember,
            };
        },

    };
</script>

<style scoped>
    .search-box {
        display: flex;
        margin-bottom: 20px;
        margin-left:10px;
    }

    .search-box input {
        flex-grow: 1;
    }


    hr{
        border: 3px dashed #2c3e50;
        height: 5px;
        opacity: 0.1;
    }

    button{
        border-radius: 10px;
        width: 100px;
        text-align: center;
        border: 1px solid lightblue;
        margin:0 10px;
    }
</style>
