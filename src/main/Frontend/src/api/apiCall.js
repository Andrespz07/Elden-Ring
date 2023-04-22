import axios from 'axios';
import { ref } from 'vue';

export default class apiRequest {
  request;
  constructor() {
    this.request = ref([]);
  }
  getRequest() {
    return this.request.value;
  }

  async fetchAllRequest() {
    try {
      const response = await axios.get('http://localhost:8080/api/v1/characters');
      this.request.value = response.data.feed.entry;
      console.log(response.data.feed.entry);
    } catch (error) {
      console.error(error);
    }
  }
}
