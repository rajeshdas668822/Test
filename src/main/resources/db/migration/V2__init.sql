

/****** Object:  Table [dbo].[user_role]    Script Date: 3/20/2018 8:02:24 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[user_role](
	[role_Id] [bigint] NOT NULL,
	[description] [varchar](255) NOT NULL,
	[group_name] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED
(
	[role_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO




/****** Object:  Table [dbo].[users]    Script Date: 3/20/2018 8:02:45 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[users](
	[user_id] [bigint] NOT NULL,
	[email] [varchar](255) NOT NULL,
	[name] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED
(
	[user_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


CREATE SEQUENCE [dbo].[hibernate_sequence]
 AS [int]
 START WITH 1
 INCREMENT BY 50
 MINVALUE 0
 MAXVALUE 2147483647
 CACHE
GO

insert into USERS (user_id,email,name) values (1,'Admin@gmail.com', 'Admin');