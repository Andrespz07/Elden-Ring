import { defineStore } from 'pinia';
import apiCallJSON from '../api/apiCallJSON';

export const useCharacterJsonStore = defineStore('storeJsonCharacters', {
    state:()=>  ({
        allCharacters: [],
    }),
    actions:
    {
        async getAllCharacters(){

            const api = new apiCallJSON()

            this.allCharacters = await api.fetchAllRequest()

            
        }
    }
})