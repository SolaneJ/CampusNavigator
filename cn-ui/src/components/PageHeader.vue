<template>
  <el-row class="header" justify="space-between">
    <!-- 最左侧logo部分 -->
    <div class="logo-section">
      <img src="@/assets/logo.png" alt="Logo" width="32" height="32"/>
    </div>

    <div class="nav-section">
      <el-menu mode="horizontal" class="nav-button" :ellipsis="false" default-active="1">
        <el-menu-item index="1">首页</el-menu-item>
        <el-menu-item index="2">校园导览</el-menu-item>
        <el-menu-item index="3">入学流程</el-menu-item>
        <el-menu-item index="4">任务打卡</el-menu-item>
        <el-menu-item index="5">校园问答</el-menu-item>
      </el-menu>
      <n-input class="search-box" placeholder="搜索..." clearable/>
    </div>
    <div class="user-section">
      <n-dropdown :options="options" @select="handleSelect">
        <n-avatar size="small" src="https://07akioni.oss-cn-beijing.aliyuncs.com/07akioni.jpeg"/>
      </n-dropdown>
    </div>
  </el-row>
</template>

<script setup>
import {useMessage} from 'naive-ui'
import {defineComponent} from 'vue'

const options = [
  {label: '用户资料', key: 'profile'},
  {label: '设置', key: 'settings'},
  {label: '退出登录', key: 'logout'}
]

function handleSelect(key) {
  console.log(key)
}
</script>

<style scoped>
.header {
  padding: 0 1% 0;
  border-bottom: 1px solid #eeeeee;
}

.logo-section {
  display: flex;
  align-items: center;
}

.logo {
  margin-left: 8px;
  font-weight: bold;
}

.nav-section {
  display: flex;
  align-items: center;
  flex: 1;
  min-width: 60%;
  max-width: 50%;
}

.nav-button {
  margin-right: 5%;
}

.nav-button > * {
  margin: 5px;
}

.search-box {
  display: flex;
  margin-left: auto;
  flex: 1;
}

.user-section {
  display: flex;
  align-items: center;
}

.user-section > * {
  margin-left: 16px;
}
</style>