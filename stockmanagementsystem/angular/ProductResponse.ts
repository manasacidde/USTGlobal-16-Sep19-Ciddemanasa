export class ProductResponse{
    constructor(
        public pid: number,
        public name: string,
        public company: string,
        public category: string,
        public quantity: number,
        public price: number
    ) {}
}