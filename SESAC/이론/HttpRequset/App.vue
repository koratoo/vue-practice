<template>
  <div>
    <h2>Hello HTTP Request</h2>
    <TodoList />
  </div>
</template>
<script>
import TodoList from "./components/http/TodoList";
export default {
  name: "App",
  components: {
    TodoList,
  },
  data() {
    return {};
  },
  methods: {},
};
</script>

<style scoped></style>
