--
-- JBoss, Home of Professional Open Source
-- Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
-- contributors by the @authors tag. See the copyright.txt in the
-- distribution for a full listing of individual contributors.
--
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
-- http://www.apache.org/licenses/LICENSE-2.0
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
--

-- You can use this file to load seed data into the database using SQL statements
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