export class Messages {

    idMessage:string;
	
	contentMessage:string;
	
	likesMessage:number;	
	
	idSujet:string;

    createdDateMessage: Date;

    updateDateMessage: Date;

    constructor(idMessage:string, contentMessage:string, likesMessage:number, idSujet:string, createdDateMessage: Date,updateDateMessage: Date ){
            this.idMessage = idMessage;
            this.contentMessage = contentMessage;
            this.likesMessage = likesMessage;
            this.idSujet = idSujet;
            this.createdDateMessage = createdDateMessage;
            this.updateDateMessage = updateDateMessage;
    }
}