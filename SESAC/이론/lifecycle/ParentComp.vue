<template>
  <div>
    <h2>Parent Component</h2>
    <ChildComp v-if="showChild" />
    <button @click="showChild = false">unmount child</button>
  </div>
</template>
<script>
import ChildComp from "./ChildComp";
export default {
  name: "parentComp",
  data() {
    return {
      showChild: true,
    };
  },
  components: {
    ChildComp,
  },
  beforeCreate() {
    console.log("parent beforeCreate");
  },
  created() {
    console.log("parent created");
  },
  beforeMount() {
    console.log("parent beforeMount");
  },
  mounted() {
    console.log("parent mounted");
  },
  beforeUpdate() {
    console.log("parent beforeUpdate");
  },
  updated() {
    console.log("parent updated");
  },
  beforeUnmount() {
    console.log("parent beforeUnmount");
  },
  unmounted() {
    console.log("parent unmounted");
  },
};
</script>

<style></style>
