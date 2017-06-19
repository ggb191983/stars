CREATE DATABASE `starsdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `carts` (
  `carts_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `carts_user_uuid` binary(16) NOT NULL,
  `carts_creation_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `carts_update_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`carts_id`),
  UNIQUE KEY `carts_user_uuid_UNIQUE` (`carts_user_uuid`),
  CONSTRAINT `FK7pamonqm0kppjppcvk1h5bjlv` FOREIGN KEY (`carts_user_uuid`) REFERENCES `users` (`user_uuid`),
  CONSTRAINT `cart_user_uuid_fk` FOREIGN KEY (`carts_user_uuid`) REFERENCES `users` (`user_uuid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `categories` (
  `category_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `category_name` varchar(45) NOT NULL,
  `category_description` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `category_name_UNIQUE` (`category_name`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8;

CREATE TABLE `products` (
  `product_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `product_brief_description` varchar(255) DEFAULT NULL,
  `product_cart_id` int(10) unsigned DEFAULT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_price` decimal(19,2) unsigned zerofill NOT NULL,
  `product_sub_category_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  UNIQUE KEY `product_name_UNIQUE` (`product_name`),
  KEY `FKfgcb17050ipwf8n84ixg1muqa` (`product_sub_category_id`),
  KEY `products_cart_id_fk_idx` (`product_cart_id`),
  CONSTRAINT `products_cart_id_fk` FOREIGN KEY (`product_cart_id`) REFERENCES `carts` (`carts_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `products_sub_category_id_fk` FOREIGN KEY (`product_sub_category_id`) REFERENCES `sub_categories` (`sub_category_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE `sub_categories` (
  `sub_category_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `sub_category_description` varchar(255) DEFAULT NULL,
  `sub_category_name` varchar(255) DEFAULT NULL,
  `sub_category_category_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`sub_category_id`),
  UNIQUE KEY `sub_category_name_UNIQUE` (`sub_category_name`),
  KEY `sub_category_category_id_fk_idx` (`sub_category_category_id`),
  CONSTRAINT `sub_category_category_id_fk` FOREIGN KEY (`sub_category_category_id`) REFERENCES `categories` (`category_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

CREATE TABLE `users` (
  `user_uuid` binary(16) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  PRIMARY KEY (`user_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `starsdb`.`products`(`product_name`,`product_brief_description`,`product_price`) VALUES ('Jabón', 'Jabón de ducha que suaviza tú piel', 3.25);
INSERT INTO `starsdb`.`products`(`product_name`,`product_brief_description`,`product_price`) VALUES ('Aceite','Aceite de oliva virgen extra',3.20);

-- Categories

INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Ropa y Accesorios de las mujeres');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Ropa y Accesorios');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'La Madre y Los Niños');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Deportes y Entrenamiento');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Joyas y Accesorios');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Teléfonos y Telecomunicaciones');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Zapatos');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Informática y Oficina');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Electrónica de consumo');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Hogar y Jardín');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Maletas y Bolsos');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Salud y Belleza');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Relojes');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Juguetes y Pasatiempos');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Bodas y Eventos');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Novedad y de uso especial');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Automóviles y Motocicletas');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Muebles');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Luces e Iluminación');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Componentes y sistemas Electrónicos');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Office & School Supplies');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Mejoras para el hogar');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Alimentos');
INSERT INTO `starsdb`.`categories` (`category_description`,`category_name`) VALUES (null,'Seguridad y Defensa');


-- Subcategories
-- Ropa y Accesorios de las mujeres
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Vestidos' , 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Blusas y Camisas', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Chaquetas y Abrigos', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Camisetas y Tops', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Accesorios', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Bottoms', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Intimates', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Trajes y Conjuntos', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Camisas y Sudaderas', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Calcetines y Calcetería', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Para dormir y Descansar', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Suéteres', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Mamelucos', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Monos', 1);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Mono', 1);

-- Ropa y Accesorios
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Camisas y Sudaderas', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Suéteres', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Camisetas y Tops', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Chaquetas y Abrigos', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Camisas', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Accesorios', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Bottoms', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Pantalones', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'vaqueros', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Ropa interior', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Trajes y Blazers', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Para dormir y Descansar', 2);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Pantalones cortos Calcetines', 2);

-- La madre y Los Niños
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Ropa de bebe (chica)', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Ropa de bebe (chico)', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Ropa de niña', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Ropa de niño', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Zapatos de bebe', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Zapatos de niño/a', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Utensilios de bebé', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Utensilios de movilidad para bebés', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Seguridad', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Descanso del bebé', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Alimentación', 3);
INSERT INTO `starsdb`.`sub_categories`(`sub_category_description`,`sub_category_name`,`sub_category_category_id`) VALUES (null, 'Maternidad', 3);