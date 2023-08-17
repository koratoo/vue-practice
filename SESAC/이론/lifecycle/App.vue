<template>
  <div>
    <h2>Hello Life Cycle</h2>
    <ParentComp />
  </div>
</template>
<script>
import ParentComp from "./components/lifecycle/ParentComp";
export default {
  name: "App",
  components: { ParentComp },
  data() {
    return {};
  },
  methods: {},
};
</script>

<style scoped></style>
