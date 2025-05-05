import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

// naive-ui
import naive from 'naive-ui'

// element-plus
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

// pinia
import { createPinia } from 'pinia'

const app = createApp(App)

app.use(router)
app.use(naive)
app.use(ElementPlus)
app.use(createPinia())

app.mount('#app')