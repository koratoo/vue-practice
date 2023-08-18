import { ref } from "vue";
function useMoney(initialTotalMoney) {
  const totalMoney = ref(initialTotalMoney);
  function addMoney(price) {
    totalMoney.value += price;
  }

  return {
    totalMoney,
    addMoney,
  };
}

export default useMoney;
