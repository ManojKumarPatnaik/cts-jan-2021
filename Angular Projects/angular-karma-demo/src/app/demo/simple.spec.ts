import { greetings, incrementByOne } from './simple';

// all the unit test cases are wrapped in a suite which is 'describe'

describe('Functions inside simple', () => {
    // unit test cases are written in the 'it'
    it('Check for the welcome message', () => {
        const result = greetings('Alex');
        expect(result).toContain('Alex');
    });
    // unit test case for incrementByOne
    it('Increment the number by 1', () => {
        const value = incrementByOne(1);
        expect(value).toBeGreaterThan(1)
    });
});