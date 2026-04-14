import { Role } from "./enum.roles";

export class User {
    _id?: number;
    login?: string;
    password?: string;
    role?: Role.USER;
    name?: string;
    cnpj?: string;     
    address?: string; 
    num?: string;
    neighborhood?: string; 
    cep?: string;   
    city?: string;
    region?: string;
    dateTime?: dateFns;    
}