<template>
  <div>
    <h3>{{ fullname }}</h3>
    <button @click="sendParent">child click</button>
  </div>
</template>

<script>
import { computed } from "vue";
export default {
  name: "childComponent",
  props: ["firstname", "lastname"],
  setup(props, context) {
    console.log(context);
    const fullname = computed(() => {
      return `${props.firstname} ${props.lastname}`;
    });
    function sendParent() {
      context.emit("sendParent");
    }
    return {
      fullname,
      sendParent,
    };
  },
};
</script>

<style></style>
