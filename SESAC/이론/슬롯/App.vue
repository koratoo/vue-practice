<template>
  <div>
    <h2>Hello Slots</h2>
    <CardView>
      <template v-slot:header>
        <h3>RandomImage</h3>
      </template>
      <template v-slot:body>
        <img src="https://picsum.photos/200/200" />
      </template>
      <template v-slot:footer>
        <small>thank you!</small>
      </template>
    </CardView>
  </div>
</template>
<script>
import CardView from "./components/slots/CardView";
export default {
  name: "App",
  components: {
    CardView,
  },
  data() {
    return {};
  },
  methods: {},
};
</script>

<style></style>
