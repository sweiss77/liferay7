import Vue from 'vue';
import App from './App';

export default function(portletNamespace, spritemap) {

	const vueConfig = require('vue-config');
	const configs = {
		spritemap: spritemap
	};
	Vue.use(vueConfig, configs);
	Vue.config.productionTip = false;

	/* eslint-disable no-new */
	new Vue({
		el: `#${portletNamespace}-1`,
		components: { App },
		template: '<App/>',
	})
}
