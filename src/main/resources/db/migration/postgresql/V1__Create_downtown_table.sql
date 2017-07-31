create table downtown (
    id  bigserial not null,
    annual_sales_turnover int8,
    area int4,
    code1 int4,
    code2 int4,
    commercial_accumulation_code int4,
    employee_count int4,
    inside_shop_count int4,
    latitude float8,
    longitude float8,
    name varchar(255),
    office_count int4,
    prefecture_code int4,
    primary key (id)
);