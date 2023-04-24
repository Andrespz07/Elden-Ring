import axios from 'axios';

export default class apiRequest {
  url;
  constructor() {
    this.url = 'http://localhost:8080/api/v1';
  }

  async fetchAllRequest() {
    try {
      const response = await axios.get(this.url+'/characters'); 
      return response.data;
    } catch (error) {
      console.error(error);
    }
  }
}
