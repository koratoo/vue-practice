<template>
  <div>
    <h2>Hello Composition API</h2>
    <TestComponent />
  </div>
</template>
<script>
import TestComponent from "./components/composition/TestComponent";
export default {
  name: "App",
  components: { TestComponent },
  data() {
    return {};
  },
  methods: {},
};
</script>

<style scoped></style>
