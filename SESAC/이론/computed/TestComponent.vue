<template>
  <div>
    <h2>handsome? {{ username }}</h2>
    <hr />
    <div>
      price <input type="number" v-model="price" /> amount
      <input type="number" v-model="amount" />
      <h3>Total Price : {{ totalPrice }}</h3>
    </div>
    <hr />
    <div>
      first <input type="text" v-model="home.city" /> last
      <input type="text" v-model="last" />
      <h3>Full name :: {{ fullName }}</h3>
    </div>
  </div>
</template>

<script>
import { ref, computed, reactive, toRefs, watch } from "vue";
export default {
  name: "TestComponent",
  setup() {
    const username = ref("scalper");
    const price = ref(5000);
    const amount = ref(1);
    const totalPrice = computed(() => {
      return price.value + amount.value;
    });

    watch(price, (newValue, oldValue) => {
      console.log(newValue, oldValue);
    });

    const state = reactive({
      first: "Code",
      last: "Scalper",
      home: {
        city: "Seoul",
        type: "Apartment",
      },
    });
    watch(
      () => {
        return state.first;
      },
      (newValue, oldValue) => {
        console.log(newValue, oldValue);
      }
    );

    const fullName = computed(function () {
      return `${state.first}  ${state.last}`;
    });
    watch(
      () => {
        return { ...state.home };
      },
      (newValue, oldValue) => {
        console.log(newValue, oldValue);
      },
      { deep: true }
    );

    return {
      username,
      price,
      amount,
      totalPrice,
      ...toRefs(state),
      fullName,
    };
  },
  // data() {
  //   return {
  //     price: 5000,
  //     amount: 1,
  //   };
  // },
  // computed: {
  //   totalPrice() {
  //     return this.price * this.amount;
  //   },
  // },
};
</script>

<style></style>
