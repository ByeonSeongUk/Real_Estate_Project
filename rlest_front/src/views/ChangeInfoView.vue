<template>
  <div id="ChangeInfoView">
    <EmailModal></EmailModal>
    <ChangeInfo></ChangeInfo>
  </div>
</template>

<script>
import ChangeInfo from "../components/ChangeInfoPage";
import EmailModal from "../components/EmailModal";
export default {
  name: "ChangeInfoView",
  data() {
    return {
    }
  },
  methods:{

  },
  components: {
    EmailModal,
    ChangeInfo
  }

}
</script>

<style scoped>

</style>