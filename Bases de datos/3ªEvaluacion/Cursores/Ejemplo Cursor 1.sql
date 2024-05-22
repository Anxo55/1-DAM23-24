CREATE DEFINER=`root`@`localhost` PROCEDURE `EjemploCursor1`()
BEGIN
	DECLARE done INT DEFAULT 0;
    DECLARE nombre VARCHAR(50);
    DECLARE apellido VARCHAR(50);
    DECLARE actor_cursor CURSOR FOR SELECT first_name, last_name FROM actor;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    OPEN actor_cursor;

    bucle_cursor: LOOP
        FETCH actor_cursor INTO nombre, apellido;
        IF done THEN
            LEAVE bucle_cursor;
        END IF;
        INSERT INTO nombres_actor (nombre, apellido) VALUES (nombre, apellido);
    END LOOP;

    CLOSE actor_cursor;
END