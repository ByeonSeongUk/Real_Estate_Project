<template>
  <div id="JoinView">
    <EmailModal></EmailModal>
    <JoinPage></JoinPage>
  </div>
</template>

<script>
import JoinPage from "@/components/JoinPage";
import EmailModal from "@/components/EmailModal";
export default {
  name: "JoinView",
  data() {
    return {
    }
  },
  methods:{

  },
  components: {
    EmailModal,
    JoinPage
  }

}
</script>

<style scoped>

</style>