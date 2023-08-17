<template>
  <div>
    <h2>handsome? {{ isHandsome }}</h2>
    <h2>{{ name }}</h2>
  </div>
</template>

<script>
import { ref, reactive, toRefs } from "vue";
export default {
  name: "TestComponent",
  setup() {
    let isHandsome = ref(false);
    const state = reactive({
      username: "Scalper",
      age: 50,
      job: "programmer",
    });

    return {
      isHandsome,
      ...toRefs(state),
    };
  },
  //   data() {
  //     return {
  //       username: "Scalper",
  //     };
  //   },
};
</script>

<style></style>
