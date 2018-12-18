SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS repair;
CREATE TABLE repair (
                        `id` int(11) NOT NULL,
                        `datetime` date DEFAULT NULL,
                        `katastasi` varchar(65) DEFAULT NULL,
                        `eidosepiskeuis` varchar(45) DEFAULT NULL,
                        `kostos` double DEFAULT NULL,
                        `owner` varchar(45) DEFAULT NULL,
                        `perigrafi` varchar(45) DEFAULT NULL,
                        `userOwner_id` int(11) DEFAULT NULL,
                        PRIMARY KEY (`id`),
                        KEY `userOwner_id_idx` (`userOwner_id`),
                        CONSTRAINT `userOwner_id` FOREIGN KEY (`userOwner_id`) REFERENCES `owneruser` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS owneruser;
CREATE TABLE owneruser (
                         `id` int(11) NOT NULL,
                         `afm` varchar(20) DEFAULT NULL,
                         `onoma` varchar(20) DEFAULT NULL,
                         `epitheto` varchar(20) DEFAULT NULL,
                         `dieuthinsi` varchar(30) DEFAULT NULL,
                         `email` varchar(35) DEFAULT NULL,
                         `kwdikoxristi` varchar(120) DEFAULT NULL,
                         `markaoximatos` varchar(20) DEFAULT NULL,
                         `pinakidaoximatos` varchar(20) DEFAULT NULL,
                         `tipoxristi` varchar(13) DEFAULT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;