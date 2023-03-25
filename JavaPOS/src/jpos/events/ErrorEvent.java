/////////////////////////////////////////////////////////////////////
//
// THIS SOFTWARE IS PROVIDED AS IS. THE JAVAPOS WORKING GROUP MAKES NO 
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, 
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED 
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR 
// NON-INFRINGEMENT.  INDIVIDUAL OR CORPORATE MEMBERS OF THE JAVAPOS 
// WORKING GROUP SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED AS A RESULT
// OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
// 
// ErrorEvent
//
//   Class defining the Error Event generated by JavaPOS device 
//   controls.
//
// Modification history
// ------------------------------------------------------------------
// 98-02-18 JavaPOS Release 1.2                                   BS
//
/////////////////////////////////////////////////////////////////////

package jpos.events;

public class ErrorEvent extends JposEvent
{
    public ErrorEvent(Object source, int errorCode, int errorCodeExtended,
                      int errorLocus, int errorResponse)
    {
        super(source);

        this.errorCode = errorCode;
        this.errorCodeExtended = errorCodeExtended;
        this.errorLocus = errorLocus;
        this.errorResponse = errorResponse;
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    public int getErrorCodeExtended()
    {
        return errorCodeExtended;
    }

    public int getErrorLocus()
    {
        return errorLocus;
    }

    public int getErrorResponse()
    {
        return errorResponse;
    }

    public void setErrorResponse(int errorResponse)
    {
        this.errorResponse = errorResponse;
    }

    protected int errorCode;
    protected int errorCodeExtended;
    protected int errorLocus;
    protected int errorResponse;
}