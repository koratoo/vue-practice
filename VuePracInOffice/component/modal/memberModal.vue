<template>
    <div class="modal">
        <div class="modal-content">
            <div v-if="state.memberDetails">
                ⭕ <strong>회원 정보</strong>
                <hr/>
                 <input v-model="state.memberDetails.name" type="text" readonly />
                 <input v-model="state.memberDetails.engName" type="text" readonly />
                 <input v-model="state.memberDetails.chnName" type="text" readonly />
                 <input v-model="state.memberDetails.juminNo" type="text" readonly />
                 <input v-model="state.memberDetails.addr" type="text" readonly />
                 <input v-model="state.memberDetails.addrdtl" type="text" readonly />
                 <input v-model="state.memberDetails.email" type="text" readonly />
                 <input v-model="state.memberDetails.phone" type="text" readonly />
                 <input v-model="state.memberDetails.emplType" type="text" readonly />
            </div>
            <hr/>
            <button @click="$emit('close-modal')">닫기</button>
        </div>
    </div>
</template>

<script>
    import axios from "axios";
    import { reactive, onMounted } from "vue";

    const fetchData = async (mno) => {
        try {
            const response = await axios.get("http://localhost:8080/member/dtl", { params: { mno: mno } });
            return response.data;
        } catch (e) {
            console.log(e);
        }
    };

    export default {
        name: "MemberDetailModal",

        props: {
            mno: {
                type: [Number, String],
                required: true
            }
        },
        setup(props) {
            const state = reactive({
                memberDetails: null,
            });

            const fetchMemberDetails = async () => {
                state.memberDetails = await fetchData(props.mno);
            };

            onMounted(() => {
                fetchMemberDetails();
            });

            return { state };
        },
    };
</script>

<style scoped>
    .modal {
        position: fixed;
        z-index: 9998;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background-color: rgba(0, 0, 0, 0.5);
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .modal-content {
        background-color: #ffffff;
        padding: 30px;
        border-radius: 10px;
        width: 30%;
    }


    input {
        width: 100%;
        border: 1px solid #dddddd;
        padding: 10px;
        border-radius: 4px;
        box-sizing: border-box;
        text-align:center;
    }

    button {
        cursor: pointer;
        border: none;
        outline: none;
        background-color: rgb(80, 80, 255);
        color: white;
        padding: 10px 20px;
        border-radius: 4px;
    }

    button:hover {
        background-color: rgb(70, 70, 255);
    }
</style>
