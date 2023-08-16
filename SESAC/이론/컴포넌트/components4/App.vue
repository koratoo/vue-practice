<template>
  <div>
    <h2>Hello Component</h2>
    <button @click="displayDetail = true">show detail</button>
    <DetailView v-if="displayDetail" @closeDetail="close" />
  </div>
</template>

<script>
import DetailView from "./components/DetailView.vue";
export default {
  name: "App",
  components: {
    DetailView,
  },
  data() {
    return {
      displayDetail: false,
    };
  },
  methods: {
    close() {
      this.displayDetail = false;
      console.log("event emit!!!");
    },
  },
};
</script>

<style></style>
