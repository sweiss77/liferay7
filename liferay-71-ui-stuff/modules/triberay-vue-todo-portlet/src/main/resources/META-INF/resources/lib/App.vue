<template>
  <div id="todoApp">
    <nav class="navbar navbar-expand-lg navbar-dark primary-color card">
      <a
        class="navbar-brand"
        href="#">To Do App</a>
    </nav>
    <TodoList/>
  </div>
</template>

<script>
    import TodoList from './components/TodoList.vue'

    export default {
        components: {
            TodoList
        }
    }
</script>

<style lang="scss">
    @import './variables.scss';

    *, *::before, *::after {
      box-sizing: border-box;
    }

    #todoApp {
      line-height: 1.4;
      -webkit-font-smoothing: antialiased;
      -moz-osx-font-smoothing: grayscale;
      color: $triberay-light-blue;
    }
</style>

