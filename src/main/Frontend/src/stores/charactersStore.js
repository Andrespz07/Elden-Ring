import { defineStore } from 'pinia';
import apiRequest from '../api/apiCall';

export const useCharacterStore = defineStore('storeCharacters', {
    state:()=>  ({
        allCharacters: [],
    }),
    actions:
    {
        async getAllCharacters(){

            const api = new apiRequest()

            this.allCharacters = await api.fetchAllRequest()

            
        }
    }
})