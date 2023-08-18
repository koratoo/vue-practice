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
import useMoney from "../../composables/useMoney";
export default {
  name: "feeStatus",
  setup() {
    const { addMoney, totalMoney } = useMoney();

    return {
      addMoney,
      totalMoney,
    };
  },
};
</script>

<style></style>
