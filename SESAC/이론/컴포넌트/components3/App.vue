<template>
  <div>
    <ProductList :products="products" />
  </div>
</template>

<script>
import ProductList from "./components/ProductList";
export default {
  name: "App",
  components: {
    ProductList,
  },
  data() {
    return {
      products: [
        { id: 0, name: "TV", price: 500000, company: "LG" },
        { id: 1, name: "전자렌지", price: 200000, company: "삼성" },
        { id: 2, name: "가스오븐", price: 300000, company: "한화" },
        { id: 3, name: "냉장고", price: 50000, company: "대우" },
        { id: 4, name: "에어컨", price: 1000000, company: "해태" },
      ],
    };
  },
};
</script>

<style></style>
