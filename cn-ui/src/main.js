import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

// naive-ui
import naive from 'naive-ui'

// element-plus
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

const app = createApp(App)

app.use(router)
app.use(naive)
app.use(ElementPlus)

app.mount('#app')