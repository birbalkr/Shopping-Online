import axios from 'axios'


// eslint-disable-next-line no-undef
const Book_API_URL=`${process.env.REACT_API_URL}api/book`;

const Computer_API_URL="http://localhost:8080/api/computer"

class OnlineService{
    getBooks(){
        return axios.get(Book_API_URL)
    }

    getcomputer(){
        return axios.get(Computer_API_URL)
    }
}
export default new OnlineService();