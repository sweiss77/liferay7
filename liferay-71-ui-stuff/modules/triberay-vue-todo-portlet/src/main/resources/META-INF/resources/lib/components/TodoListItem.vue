<template>
  <li class="list-group-item d-flex justify-content-between align-items-center">
    {{ todo.text }}
    <a
      :key="todo.text"
      @click="$emit('remove', todo.id)">

      <svg class="lexicon-icon">
        <use :href="$config.spritemap + 'trash'" />
      </svg>
    </a>
  </li>
</template>

<script>
    export default {
      props: {
          todo: {
              type: Object,
              required: true
          }
      }
    }
</script>

<style lang="scss" scoped>
  .v-icon {
    cursor: pointer;
  }
</style>
