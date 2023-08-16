<template>
  <div class="wrapper">
    <div class="container">
      <h2>Detail Page</h2>
      <button @click="closeDetail">close</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "detailPage",
  methods: {
    closeDetail() {
      this.$emit("closeDetail");
    },
  },
};
</script>

<style scoped>
.wrapper {
  background: rgba(0, 0, 0, 0.5);
  position: fixed;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  display: flex;
  justify-content: center;
  align-items: center;
}
.container {
  background: #fff;
  width: 60%;
}
</style>
