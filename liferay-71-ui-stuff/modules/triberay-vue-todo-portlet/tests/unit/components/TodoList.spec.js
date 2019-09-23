import { shallowMount } from '@vue/test-utils';
import TodoList from '../../../src/main/resources/META-INF/resources/lib/components/TodoList';

describe('TodoList.vue', () => {
  it('should render a list', () => {
    const wrapper = shallowMount(TodoList);
    const contentUL = wrapper.find('ul');
    const contentTodoListItem = wrapper.find('TodoListItem');
    expect(contentUL.exists());
    expect(contentTodoListItem.exists());
  })
})
