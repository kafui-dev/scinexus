CREATE TABLE IF NOT EXISTS post (
                                    id INT PRIMARY KEY AUTO_INCREMENT,
                                    title VARCHAR(255) NOT NULL,
    subheading VARCHAR(255),
    slug VARCHAR(255),
    date_created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    date_updated TIMESTAMP,
    category VARCHAR(255),
    author VARCHAR(255),
    content TEXT NOT NULL,
    image_url VARCHAR(255)
    );
