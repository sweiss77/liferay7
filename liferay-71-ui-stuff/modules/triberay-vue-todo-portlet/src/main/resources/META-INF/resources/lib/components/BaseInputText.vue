<template>
  <input
    :value="value"
    type="text"
    class="input"
    v-on="listeners"
  >
</template>

<script>
    export default {
      props: {
          value: {
              type: String,
              default: '',
          }
      },
      computed: {
          listeners () {
              return {
                  // Pass all component listeners directly to input
                  ...this.$listeners,
                  // Override input listener to work with v-model
                  input: event => this.$emit('input', event.target.value)
              }
          }
      }
    }
</script>

<style lang="scss" scoped>
    @import '../variables.scss';

  .input {
    padding: 8px 10px;
    margin: 5px;
    border: 1px solid rgba(0, 0, 0, 0.1);
    -webkit-box-shadow: inset 2px 2px 2px 0 $triberay-light-blue;
    -moz-box-shadow: inset 2px 2px 2px 0 $triberay-light-blue;
    box-shadow: inset 2px 2px 2px 0 $triberay-light-blue;
  }
</style>
