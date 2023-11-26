CREATE TABLE `user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `booking` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name`  VARCHAR(45) NULL,
  `field_one` VARCHAR(45) NULL,
  `field_two` VARCHAR(45) NULL,
  `field_three` VARCHAR(45) NULL,
  `field_four` VARCHAR(45) NULL,
  `field_five` VARCHAR(45) NULL,
  `create_date` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));

CREATE TABLE station (
   `id` INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NULL,
  status VARCHAR(45) NULL,
  time VARCHAR(45) NULL,
  PRIMARY KEY (`id`));  
  
  
  INSERT INTO `station` (`id`, `name`, `time`) VALUES ('1', 'EVolt Charging Station', '06.30-6.57');
   INSERT INTO `station` (`id`, `name`, `time`) VALUES ('2', 'EVolt Charging Station', '07.00-07.27');
    INSERT INTO `station` (`id`, `name`, `time`) VALUES ('3', 'EVolt Charging Station', '07.30-08.27');
     INSERT INTO `station` (`id`, `name`, `time`) VALUES ('4', 'PTT Station ปตท.มหาวิทยาลัยแม่ฟ้าหลวง', '06.30-6.57');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('5', 'PTT Station ปตท.มหาวิทยาลัยแม่ฟ้าหลวง', '07.00-07.27');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('6', 'PTT Station ปตท.มหาวิทยาลัยแม่ฟ้าหลวง', '07.30-08.27');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('7', 'ปั๊มเอสโซ่ หจก.ภาณุออยล์ เซอร์วิส ', '06.30-06.57');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('8', 'ปั๊มเอสโซ่ หจก.ภาณุออยล์ เซอร์วิส', '07.00-07.27');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('9', 'ปั๊มเอสโซ่ หจก.ภาณุออยล์ เซอร์วิส', '07.30-08.27');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('10', 'PTT Station ปตท.ห้าแยกพ่อขุน สถานีบริการน้ำมัน + NGV + EV เคยูออยล์', '06.30-06.57');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('11', 'PTT Station ปตท.ห้าแยกพ่อขุน สถานีบริการน้ำมัน + NGV + EV เคยูออยล์', '07.00-07.27');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('12', 'PTT Station ปตท.ห้าแยกพ่อขุน สถานีบริการน้ำมัน + NGV + EV เคยูออยล์', '07.30-08.27');
INSERT INTO `station` (`id`, `name`, `time`) VALUES ('13', 'PTT Station ปตท.ริมกก (น้ำมัน+EV) หจก.ปัญญามอเตอร์ส', '06.30-06.57');
  INSERT INTO `station` (`id`, `name`, `time`) VALUES ('14', 'PTT Station ปตท.ริมกก (น้ำมัน+EV) หจก.ปัญญามอเตอร์ส', '07.00-07.27');    
    INSERT INTO `station` (`id`, `name`, `time`) VALUES ('15', 'PTT Station ปตท.ริมกก (น้ำมัน+EV) หจก.ปัญญามอเตอร์ส', '07.30-08.27');   
    INSERT INTO `station` (`id`, `name`, `time`) VALUES ('16', 'PTT Station ปตท.เวียงป่าเป้า (น้ำมัน+EV) (เชียงรายกิตติรัตน์ สาขาเวียงป่าเป้า)', '06.30-06.57');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('17', 'PTT Station ปตท.เวียงป่าเป้า (น้ำมัน+EV) (เชียงรายกิตติรัตน์ สาขาเวียงป่าเป้า)', '07.00-07.27');    
   INSERT INTO `station` (`id`, `name`, `time`) VALUES ('18', 'PTT Station ปตท.เวียงป่าเป้า (น้ำมัน+EV) (เชียงรายกิตติรัตน์ สาขาเวียงป่าเป้า)', '07.30-08.27'); 
    INSERT INTO `station` (`id`, `name`, `time`) VALUES ('19', 'PTT Station ปตท. ถนนบายพาสวงแหวนตะวันออกเชียงราย (น้ำมัน+EV)', '06.30-06.57');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('20', 'PTT Station ปตท. ถนนบายพาสวงแหวนตะวันออกเชียงราย (น้ำมัน+EV)', '07.00-07.27');    
   INSERT INTO `station` (`id`, `name`, `time`) VALUES ('21', 'PTT Station ปตท. ถนนบายพาสวงแหวนตะวันออกเชียงราย (น้ำมัน+EV)', '07.30-08.27');
     INSERT INTO `station` (`id`, `name`, `time`) VALUES ('22', 'PTT Station ปตท.แม่ขะจาน (น้ำมัน+EV) หจก.เชียงรายกิตติรัตน์', '06.30-06.57');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('23', 'PTT Station ปตท.แม่ขะจาน (น้ำมัน+EV) หจก.เชียงรายกิตติรัตน์', '07.00-07.27');    
   INSERT INTO `station` (`id`, `name`, `time`) VALUES ('24', 'PTT Station ปตท.แม่ขะจาน (น้ำมัน+EV) หจก.เชียงรายกิตติรัตน์', '07.30-08.27'); 
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('25', 'เซ็นทรัล เชียงราย', '06.30-06.57');
      INSERT INTO `station` (`id`, `name`, `time`) VALUES ('26', 'เซ็นทรัล เชียงราย', '07.00-07.27');    
   INSERT INTO `station` (`id`, `name`, `time`) VALUES ('27', 'เซ็นทรัล เชียงราย', '07.30-08.27');   