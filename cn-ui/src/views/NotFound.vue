<template>
    <div class="centered-container">
        <n-result status="404" title="404 资源不存在" description="生活总归带点荒谬">
            <template #footer>
                <n-button>找点乐子吧</n-button>
            </template>
        </n-result>
    </div>
</template>

<style scoped>
.centered-container {
    display: flex;
    justify-content: center;
    align-items: center;
}

.n-result {
    position: absolute;
    top: 30%;
}
</style>