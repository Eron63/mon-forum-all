import { Messages } from "./message";

export class Sujets{
    
    idSujet? : string ;
	
	tilteSujet? : string ;
	
	likesSujet?:number;
	
	messagesSujet?: Array<Messages>;

    createdDateSujet?: Date;

    updateDateSujet?: Date;

}