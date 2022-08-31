<template>
  <div id="ImgModal">
    <div class="modal fade" id="imgModal" tabindex="-1" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">

          <!-- modal header -->
          <div class="modal-header">
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>

          <!-- modal body -->
          <div class="modal-body">
            <ImgBanner/>
          </div>


          <!-- modal footer -->
          <div class="modal-footer">

          </div>

        </div>
      </div>
    </div>
  </div>
</template>

<script>
import ImgBanner from "@/components/ImgBanner"
export default {
  name: "ImgModal",

  components: {
    ImgBanner
  }
  ,


}
</script>

<style scoped>

.modal-content {
  width: 60vw;
  height: 95vh;
  text-align: center;
}
.modal {
  margin: 0 auto;

}
.modal-dialog {
  margin-bottom: 0;
}

.modal-body {
  position: relative;
  height: 50vh;
  padding: 0;
  overflow: scroll;
}
@media (min-width: 576px) {
  .modal-dialog {
    max-width: 60vw;
  }
}
</style>