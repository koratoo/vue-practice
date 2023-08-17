<template>
  <div>
    <h2>전체금액 : {{ totalMoney }}</h2>
    <div>
      <button @click="addMoney(100)">100</button>
      <button @click="addMoney(200)">200</button>
      <button @click="addMoney(300)">300</button>
      <button @click="addMoney(400)">400</button>
    </div>
  </div>
</template>

<script>
import moneyMixins from "../../mixins/moneyMixins";
export default {
  name: "productStatus",
  mixins: [moneyMixins],
  components: {},
  data() {
    return {
      totalMoney: 3000,
    };
  },
  methods: {},
};
</script>

<style></style>
