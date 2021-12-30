DROP TABLE IF EXISTS PRODUCT;
CREATE TABLE PRODUCT (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    BRAND_ID TEXT NOT NULL,
    START_DATE TIMESTAMP NOT NULL,
    END_DATE TIMESTAMP NOT NULL,
    PRICE_LIST TEXT NOT NULL,
    PRODUCT_ID TEXT NOT NULL,
    PRIORITY INT,
    PRICE TEXT NOT NULL,
    CURR TEXT NOT NULL
);
