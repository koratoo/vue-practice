<template>
  <div>
    <h2>총 적금 : {{ totalMoney }}</h2>
    <button @click="addMoney(1000)">1000</button>
    <button @click="addMoney(2000)">2000</button>
    <button @click="addMoney(1150)">1150</button>
    <button @click="addMoney(2200)">2200</button>
  </div>
</template>

<script>
import moneyMixins from "../../mixins/moneyMixins";

export default {
  name: "savingStatus",
  mixins: [moneyMixins],
  data() {
    return {};
  },
  methods: {},
};
</script>

<style></style>
