<template>
  <div class="card">
    <BaseInputText
      v-model="newTodoText"
      placeholder="New To Do"
      @keydown.enter="addTodo"
    />
    <ul
      v-if="todos.length"
      class="list-group">
      <TodoListItem
        v-for="todo in todos"
        :key="todo.id"
        :todo="todo"
        @remove="removeTodo"
      />
    </ul>
    <div
      v-else
      :value="true"
      class="alert alert-secondary"
      role="alert">
      Nothing left in the list. Add a new todo in the input above.
    </div>
  </div>
</template>

<script>
    import BaseInputText from './BaseInputText.vue';
    import TodoListItem from './TodoListItem.vue';

    let nextTodoId = 1;

    export default {
        components: {
            BaseInputText, TodoListItem
        },
        data () {
            return {
                newTodoText: '',
                todos: [
                    {
                        id: nextTodoId++,
                        text: 'Learn Vue'
                    },
                    {
                        id: nextTodoId++,
                        text: 'Learn about single-file components'
                    },
                    {
                        id: nextTodoId++,
                        text: 'Write a blog post about using Vue.js in Liferay portlets'
                    },
                    {
                        id: nextTodoId++,
                        text: 'Fall in love'
                    }
                ]
            }
        },
        methods: {
            addTodo () {
                const trimmedText = this.newTodoText.trim();
                if (trimmedText) {
                    this.todos.push({
                        id: nextTodoId++,
                        text: trimmedText
                    });
                    this.newTodoText = ''
                }
            },
            removeTodo (idToRemove) {
                this.todos = this.todos.filter(todo => {
                    return todo.id !== idToRemove
                })
            }
        }
    }
</script>

<style lang="scss" scoped>
  .v-alert {
    color: darkslategrey;
  }
  .list-group {
    margin-bottom: 0;
  }
</style>
