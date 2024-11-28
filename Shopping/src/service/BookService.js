import axios from 'axios'

const Book_API_URL="http://localhost:8080/api/book"
class OnlineService{
    getBooks(){
        return axios.get(Book_API_URL)
    }
}
export default new OnlineService();