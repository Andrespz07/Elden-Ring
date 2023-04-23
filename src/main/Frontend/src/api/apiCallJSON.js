import axios from 'axios';

export default class apiCallJSON {
  async fetchAllRequest() {
    try {
      const response = await axios.get('./stores/allCharacters.json');
      return response.data;
    } catch (error) {
      console.error(error);
    }
  }
}
