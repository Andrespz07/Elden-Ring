import { createRouter, createWebHistory } from 'vue-router'
import Landing from '../views/Landing.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'Landing',
      component: Landing,
    },
    {
      path: '/Characters',
      name: 'Characters',
      component: () => import('../views/Characters.vue'),
    },
    {
      path: '/CreateCharacter',
      name: 'CreateCharacter',
      component: () => import('../views/CreateCharacter.vue'),
    },
    {
      path: '/EditCharacter',
      name: 'EditCharacter',
      component: () => import('../views/EditCharacter.vue'),
    }
  ]
})

export default router
