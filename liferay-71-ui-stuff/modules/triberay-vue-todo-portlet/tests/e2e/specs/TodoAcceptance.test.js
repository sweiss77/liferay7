module.exports = {
    'default e2e tests': browser => {
        browser
            .url(process.env.VUE_DEV_SERVER_URL)
            .waitForElementVisible('#todoApp', 5000)
            .assert.containsText('a.navbar-brand', 'To Do App')
            .assert.elementCount('nav.navbar', 1)
            .assert.elementCount('ul.list-group', 1)
            .assert.elementCount('input', 1)
            .assert.elementCount('li.list-group-item', 4)
            .assert.containsText('li.list-group-item', 'Learn Vue') // can only check the first <li> element
            .end()
    }
};
