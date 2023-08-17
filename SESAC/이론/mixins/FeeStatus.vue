<template>
  <div>
    <h2>합산된 요금 : {{ totalMoney }}</h2>
    <button @click="addMoney(50)">50</button>
    <button @click="addMoney(100)">100</button>
    <button @click="addMoney(200)">200</button>
    <button @click="addMoney(250)">250</button>
  </div>
</template>

<script>
import moneyMixins from "../../mixins/moneyMixins";

export default {
  name: "feeStatus",
  mixins: [moneyMixins],
  data() {
    return {};
  },
  methods: {},
};
</script>

<style></style>
