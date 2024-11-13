# Full-Stack Shopping Webpage

This is a full-stack shopping webpage project built with **React.js** using **Vite** for the front-end and **Spring Boot** for the back-end. The project allows users to browse products, add them to the cart, and complete the checkout process.

### Team Members:
- **Birbal Kumar**
- **Parbhakar Kumar**

## Tech Stack
- **Frontend:**
  - React.js
  - Vite (for fast development and bundling)
  - Tailwind CSS (for styling)
  - React Router (for routing)

- **Backend:**
  - Spring Boot
  - RESTful APIs
  - MySQL/MariaDB (Database)

- **Other Tools:**
  - Git (Version Control)
  - Docker (for containerization)
  - Postman (for API testing)

---

## Features
- **User Authentication**: Users can sign up, log in, and manage their profiles.
- **Product Browsing**: Users can browse products, filter by category, and view product details.
- **Shopping Cart**: Users can add products to their cart and view the total price.
- **Checkout**: Users can proceed to checkout and complete their purchase.
- **Admin Panel**: Admins can manage product listings, users, and orders.

---

## Installation

### Prerequisites

Before you start, ensure you have the following installed on your system:

- **Node.js** (for front-end)
- **JDK 11** (for back-end)
- **MySQL/MariaDB** (Database)
- **Docker** (Optional, for containerization)

### Frontend Setup (React.js with Vite)

1. Clone the repository:
    ```bash
    git clone https://github.com/birbalkr/Shopping-Online.git
    cd Shopping-Online
    ```

2. Navigate to the front-end folder and install dependencies:
    ```bash
    cd Shopping
    npm install or npm i
    ```

3. Start the development server:
    ```bash
    npm run dev
    ```

4. Open your browser and go to `http://localhost:3000` to view the application.

### Backend Setup (Spring Boot)

1. Navigate to the back-end folder and build the application:
    ```bash
    cd Shpoing_Backend
    mvn clean install
    ```

2. Configure the database connection in `application.properties`: for MySQL
    ```properties

    spring.datasource.url=jdbc:mysql://localhost:3306/employee
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.datasource.driver-class-name=com.mysql.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update   

    ```
    ### or

    Configure the database connection in `application.properties`:for MariaDB
    ```properties

    # MariaDB DataSource configuration
    spring.datasource.url=jdbc:mariadb://localhost:3306/employee
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.datasource.driver-class-name=org.mariadb.jdbc.Driver

    # Hibernate/JPA configuration
    spring.jpa.hibernate.ddl-auto=update

    ```

3. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```

4. The back-end server should be running on `http://localhost:8080`.

---

## API Endpoints

### Authentication
- **POST** `/api/auth/register`: Register a new user
- **POST** `/api/auth/login`: Login with existing user credentials
- **GET** `/api/auth/profile`: Get user profile details (requires authentication)

### Products
- **GET** `/api/products`: Get list of all products
- **GET** `/api/products/{id}`: Get product details by ID
- **POST** `/api/products`: Add a new product (admin only)
- **PUT** `/api/products/{id}`: Update product details (admin only)

### Cart
- **POST** `/api/cart/add`: Add item to cart
- **GET** `/api/cart`: Get items in cart
- **DELETE** `/api/cart/remove/{productId}`: Remove item from cart

### Checkout
- **POST** `/api/checkout`: Complete the checkout process

---

## Running with Docker (Optional)

To run the entire application (both front-end and back-end) using Docker, follow these steps:

1. Build the Docker images for both the front-end and back-end.

2. Start the Docker containers:
    ```bash
    docker-compose up
    ```

3. The application will be available at `http://localhost:80`.

---

## Contributing

We welcome contributions to this project! If you have any ideas or improvements, feel free to fork the repository and submit a pull request.

### How to Contribute:
1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature-name`)
3. Make your changes and commit them (`git commit -am 'Add new feature'`)
4. Push to your branch (`git push origin feature/your-feature-name`)
5. Create a new Pull Request

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgements

- Thanks to [Vite](https://vitejs.dev/) for providing a fast build tool for React apps.
- Thanks to [Spring Boot](https://spring.io/projects/spring-boot) for simplifying back-end development.
- Thanks to [Tailwind CSS](https://tailwindcss.com/) for a utility-first approach to styling.

---

## Contact

If you have any questions or feedback, feel free to reach out:

- **Birbal Kumar**: [birbalkr1435@gmail.com](mailto:your-email@example.com)
- **Parbhakar Kumar**: [parbhakar@example.com](mailto:parbhakar@example.com)

